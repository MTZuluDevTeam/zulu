document.addEventListener('DOMContentLoaded', () =>{


const fetchEnterprise = () => {
         //Fetching Enteprises
        fetch('/enterprises').then(response =>{
            response.json().then(
                data =>{

                    const enterpriseList = document.querySelector('#enterpriseList');

                    enterpriseList.innerHTML = '';

                    for (let i = 0; i < data.length; i++) {

                        const tr =  document.createElement('tr');   

                            tr.innerHTML += `
                            <td>
                                ${data[i]['nombreEmpresa']}
                            </td>
                            <td>
                                ${data[i]['direccionEmpresa']}
                            </td>
                            <td>
                                ${data[i]['telefono']}
                            </td>
                            <td>
                                ${data[i]['nit']}
                            </td>
                        `
                        enterpriseList.append(tr);
                    }


                
                    

                }
            )
        }

        )
    }

fetchEnterprise();

const fetchUsers = () => {
      //Fetching Users
      fetch('/users').then(response =>{
        response.json().then(
            data =>{

                const usersList = document.querySelector('#usersList');

                usersList.innerHTML = '';

                for (let i = 0; i < data.length; i++) {

                    const tr =  document.createElement('tr');   

                        tr.innerHTML += `
                        <td>
                            ${data[i]['nombres']} ${data[i]['apellidos']}
                        </td>
                        <td>
                            ${data[i]['correo']}
                        </td>
                        <td>
                            ${data[i]['empleadoTelefono']}
                        </td>
                        <td>
                            ${data[i]['empresa']['nombreEmpresa']}
                        </td>
                        
                    `
                    usersList.append(tr);
                }


               
                

            }


        )
    }

    )
  }

fetchUsers();


const fetchMovements = () => {
        //Fetching Transaction List
        fetch('/movements').then(response =>{
            response.json().then(
                data =>{
    
                    const transactionsList = document.querySelector('#transactionsList');
    
                    transactionsList.innerHTML = '';

                    let totalMov = [];                    
    
                    for (let i = 0; i < data.length; i++) {
    
                        const tr =  document.createElement('tr');   
    
                            tr.innerHTML += `
                            <td>
                                ${data[i]['conceptoMovimiento']}
                            </td>
                            <td>
                                $${data[i]['montoDinero']}
                            </td>
                            <td>
                                ${data[i]['fechaMovimiento']}
                            </td>
                            <td>
                                ${data[i]['empleado']['nombres']} ${data[i]['empleado']['apellidos']}
                            </td>
                        `
                        transactionsList.append(tr);

                        totalMov.push(data[i]['montoDinero']);

                    }
                    
                    //Calculate total:
                    document.querySelector('#movAmount').innerHTML = `$${totalMov.reduce((a, b) => a + b, 0)}`
                    
    
                }
            )
        }
    
        )
  }

fetchMovements(); 


//Updating on tab click

document.querySelectorAll('.tabs').forEach(e =>{
    e.addEventListener('click',()=>{

        if (e.dataset.bsTarget == "#movements") {
            fetchMovements(); 
            
        }
        if (e.dataset.bsTarget == "#users") {
            fetchUsers();
        }

        if (e.dataset.bsTarget == "#enterprises") {
            fetchEnterprise();
        }


    })
});



//Form de new movements

const movementsFormSubmitButton = document.querySelector('#newMovSubmit');
const movementsFormUsersListSelect = document.querySelector('#userList')


const token = document.querySelector("meta[name='_csrf']").getAttribute('content');
const header = document.querySelector("meta[name='_csrf_header']").getAttribute('content');





const eventListenerUsersToDataList = event => {

    const fetchUsersToDataList = () => {


        document.querySelector('#userlistOptions').innerHTML = ''
            //Fetching Users
            fetch('/users').then(response =>{
              response.json().then(
                  data =>{
                    
                    
                    
                    for (let i = 0; i < data.length; i++) {
                        
                        document.querySelector('#userlistOptions').innerHTML += `<option id="${data[i]['idUser']}" value="${data[i]['idUser']} | ${data[i]['nombres']} ${data[i]['apellidos']}">`;
                        
                    }               
      
                     
                      
      
                  }
      
                  
              )
          }
      
          )
    }
      
    fetchUsersToDataList();

}

movementsFormUsersListSelect.addEventListener('focus', eventListenerUsersToDataList, false);
movementsFormUsersListSelect.addEventListener('change', eventListenerUsersToDataList, false);




movementsFormSubmitButton.addEventListener('click', () => {

const movementsForm = document.querySelector('#newMovement');

if ( movementsForm.elements['concepto'].value != '' &&
  movementsForm.elements['monto'].value != '' &&
  movementsForm.elements['fecha'].value != '' &&
  movementsForm.elements['userList'].value != ''
) {

    const object = JSON.stringify({        
        "conceptoMovimiento": movementsForm.elements['concepto'].value,
        "montoDinero": movementsForm.elements['monto'].value,
        "fechaMovimiento": movementsForm.elements['fecha'].value,
        "empleado": {
            "idUser": movementsForm.elements['userList'].value.split('|')[0],     
         } 
    })

async function sendandresolve(){
    const response = await fetch('/movements', { method: "POST",  
    headers: {
        [header]: token,       
        'Content-Type':'application/json',
    }, 
    body: object})   
    console.log(object);
    return response.status;
}

sendandresolve().then(response =>{
    if (response == 200) {
        console.log(response);
        movementsForm.reset();
        fetchMovements(); 

        //Closing modal
        bootstrap.Modal.getInstance(document.querySelector('#staticBackdrop')).hide()

    }
})
    
}

    

  
  

})


//Form de new users

const usersFormSubmitButton = document.querySelector('#newUserSubmit');
const usersFormEmpresaListSelect = document.querySelector('#empresaList');


const eventListenerEmpresaToDataList = event =>{

    const fetchEmpresaToDataList = () => {


        document.querySelector('#empresaListOptions').innerHTML = ''

            //Fetching Users
            fetch('/enterprises').then(response =>{
              response.json().then(
                  data =>{                    
                    
                    
                    for (let i = 0; i < data.length; i++) {
                        
                        document.querySelector('#empresaListOptions').innerHTML += `<option id="${data[i]['idEmpresa']}" value="${data[i]['idEmpresa']} | ${data[i]['nombreEmpresa']}">`;
                        
                    }               
      
                     
                      
      
                  }
      
                  
              )
          }
      
          )
    }

    fetchEmpresaToDataList();

}

usersFormEmpresaListSelect.addEventListener('focus', eventListenerEmpresaToDataList,false)
usersFormEmpresaListSelect.addEventListener('change', eventListenerEmpresaToDataList,false)



usersFormSubmitButton.addEventListener('click', () => {

    const newUsersForm = document.querySelector('#newUsers');



if ( newUsersForm.elements['nombres'].value != '' &&
newUsersForm.elements['apellidos'].value != '' &&
newUsersForm.elements['correo'].value != '' &&
newUsersForm.elements['telefono'].value != '' &&
newUsersForm.elements['empresaList'].value != ''

  ) {

    const object = JSON.stringify({        
        "nombres": newUsersForm.elements['nombres'].value,
        "apellidos": newUsersForm.elements['apellidos'].value,
        "correo": newUsersForm.elements['correo'].value,
        "empleadoTelefono": newUsersForm.elements['telefono'].value,
        "empresa": {
            "idEmpresa": newUsersForm.elements['empresaList'].value.split('|')[0],     
         } 
    })

async function sendandresolve(){
    const response = await fetch('/users', { method: "POST",  
    headers: {
        [header]: token,       
        'Content-Type':'application/json',
    }, 
    body: object})   
    console.log(object);
    return response.status;
}

sendandresolve().then(response =>{
   if (response == 200) {
    console.log(response);
    newUsersForm.reset();
    fetchUsers();
    //Closing modal
    bootstrap.Modal.getInstance(document.querySelector('#modalUsers')).hide()

   }
})
  }
    

  
  

})



//Form de new Empresa

const empresaFormSubmitButton = document.querySelector('#newEmpresaSubmit');

empresaFormSubmitButton.addEventListener('click', () => {

    const newEmpresaForm = document.querySelector('#newEmpresa');

    if (
        newEmpresaForm.elements['nombre'].value != '' &&
        newEmpresaForm.elements['direccion'].value != '' &&
        newEmpresaForm.elements['telefono'].value != '' &&
        newEmpresaForm.elements['nit'].value != ''
        
    ) {
        const object = JSON.stringify({        
            "nombreEmpresa": newEmpresaForm.elements['nombre'].value,
            "direccionEmpresa": newEmpresaForm.elements['direccion'].value,
            "telefono": newEmpresaForm.elements['telefono'].value,
            "nit": newEmpresaForm.elements['nit'].value,
            
        })
    
    async function sendandresolve(){
        const response = await fetch('/enterprises', { method: "POST",  
        headers: {
            [header]: token,       
            'Content-Type':'application/json',
        }, 
        body: object})   
        console.log(object);
        return response.status;
    }
    
    sendandresolve().then(response =>{
    
        if (response == 200) {
            newEmpresaForm.reset();
            fetchEnterprise();
    
            //Closing modal
            bootstrap.Modal.getInstance(document.querySelector('#modalEmpresas')).hide()
        }
        
        
    
    })
      
    }
    
   
  

})



});