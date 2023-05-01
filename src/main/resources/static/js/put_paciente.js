window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_pacientes_form');

    formulario.addEventListener('submit', function (event) {

        const formData = {
            id: document.querySelector('#idPaciente').value,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            email: document.querySelector('#email').value,
            dni: document.querySelector('#dni').value,
            fechaDeIngreso: document.querySelector('#fechaDeIngreso').value,
            domicilio: {
                    id: document.querySelector('#idDomicilio').value,
                    calle: document.querySelector('#calle').value,
                    numero: document.querySelector('#numero').value,
                    localidad: document.querySelector('#localidad').value,
                    provincia: document.querySelector('#provincia').value
            }
        };

        const url = '/pacientes/modificar';
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
          const url = '/pacientes/'+ id;
          const settings = {
              method: 'GET'
          }
          fetch(url,settings)
          .then(response => response.json())
          .then(data => {
              console.log(data);
              let paciente = data;
              document.querySelector('#idPaciente').value = paciente.id;
              document.querySelector('#nombre').value = paciente.nombre;
              document.querySelector('#apellido').value = paciente.apellido;
              document.querySelector('#email').value = paciente.email;
              document.querySelector('#dni').value = paciente.dni;
              document.querySelector('#fechaDeIngreso').value = paciente.fechaDeIngreso;
              document.querySelector('#idDomicilio').value= paciente.domicilio.id;
              document.querySelector('#calle').value= paciente.domicilio.calle;
              document.querySelector('#numero').value= paciente.domicilio.numero;
              document.querySelector('#localidad').value= paciente.domicilio.localidad;
              document.querySelector('#provincia').value= paciente.domicilio.provincia;

                           document.querySelector('#div_paciente_updating').style.display = "block";
          }).catch(error => {
              alert("Error: " + error);
          })
      }