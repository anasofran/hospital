<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Agregar paciente</title>
  </head>
  <body>
    <% 
        ControladorPaciente ctrPaciente = new ControladorPaciente();
        ctrPaciente.conectar();
        int NSS = Integer.parseInt(request.getParameter("NSS"));
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String diagnostico = request.getParameter("diagnostico");
        

        Paciente paci = new Paciente(NSS, nombre, edad, diagnostico);
        ctrPaciente.agregarPaciente(paci);
        ctrPaciente.desconectar(); 
        response.sendRedirect("/Proyecto_E15/paciente"); 
    %>
  </body>
</html>