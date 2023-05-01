window.addEventListener('load', function () {

    let selectPacientes= document.querySelector('#pacienteID')
    let selectOdontologos= document.querySelector('#odontologoID')

    function getPacientes() {


        const url = '/pacientes';
        const settings = {
            method: 'GET'
        }
        fetch(url,settings)
        .then(response => response.json())
        .then(data => {
            console.log(data);

            for(paciente of data){

                  newOption = document.createElement('option');
                  newOption.value = paciente.id;
                  newOption.innerHTML = `${paciente.nombre} ${paciente.apellido}`;
                  selectPacientes.appendChild(newOption);
              };


        }).catch(error => {
            alert("Error: " + error);
        });
};


getPacientes();

function getOdontologos() {


        const url = '/odontologos';
        const settings = {
            method: 'GET'
        }
        fetch(url,settings)
        .then(response => response.json())
        .then(data => {
            console.log(data);

            for (odontologo of data) {
              newOption = document.createElement('option');
              newOption.value = odontologo.id;
              newOption.innerHTML = `Dr. ${odontologo.nombre} ${odontologo.apellido}`;
              selectOdontologos.appendChild(newOption);
            };


        }).catch(error => {
            alert("Error: " + error);
        });
};


getOdontologos();;

});


