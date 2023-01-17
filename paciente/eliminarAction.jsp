<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Eliminar paciente</title>
  </head>
  <body>
    <% 
        ControladorPaciente ctrPaciente = new ControladorPaciente();
        ctrPaciente.conectar();
        String NSS = String.parseInt(request.getParameter("NSS"));
        
        ctrPaciente.eliminarPaciente(NSS);
        ctrPaciente.desconectar(); 
        response.sendRedirect("consultar.jsp"); 
    %>
  </body>
</html>