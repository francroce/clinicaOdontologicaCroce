window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_odontologos_form');

    formulario.addEventListener('submit', function (event) {


        const formData = {
            id: document.querySelector('#idOdontologo').value,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            matricula: document.querySelector('#matricula').value,

        };

        const url = '/odontologos/modificar';
        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }
          fetch(url,settings)
          .then(response => response.json())

    })
 })

    function findBy(id) {
          const url = '/odontologos/'+ id;
          const settings = {
              method: 'GET'
          }
          fetch(url,settings)
          .then(response => response.json())
          .then(data => {
              console.log(data)
              let odontologo = data;
              document.querySelector('#idOdontologo').value = odontologo.id;
              document.querySelector('#nombre').value = odontologo.nombre;
              document.querySelector('#apellido').value = odontologo.apellido;
              document.querySelector('#matricula').value = odontologo.matricula;

              document.querySelector('#div_odontologo_updating').style.display = "block";
          }).catch(error => {
              alert("Error: " + error);
          })
      }