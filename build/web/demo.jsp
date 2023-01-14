<%-- 
    Document   : demo
    Created on : 11/01/2023, 12:25:24 AM
    Author     : bryanulises
--%>

<%@page import="java.util.ArrayList" %>
<%@page import="Datos.ControladorEmpleado" %>
<%@page import="Modelo.Empleado" %>
<%@page import="Estadisticas.EmpleadoEstadisticas" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Empelados</h1>
        <%
            ControladorEmpleado ctrEmpleado = new ControladorEmpleado();
            ctrEmpleado.conectar();
            ArrayList<Empleado> empleados = ctrEmpleado.consultarEmpleados(" ORDER BY salario DESC");
        %>
        <table border="1" width="100%">
            <tr>
                <th>No</th>
                <th>Nombre</th>
                <th>Sexo</th>
                <th>Edad</th>
                <th>Salario</th>
            </tr>
            <%
                for (Empleado e: empleados){
                    out.println("<tr><td>" + e.getNoEmpleado() + "</td>");
                    out.println("<td>" + e.getNombre() + "</td>");
                    out.println("<td>" + e.getSexo() + "</td>");
                    out.println("<td>" + e.getEdad()+ "</td>");
                    out.println("<td>" + e.getSalario()+ "</td></tr>");
                }
            %>
        </table>
        <br/>
        <h2>Estadisticas</h2>
        <%
            EmpleadoEstadisticas data = new EmpleadoEstadisticas(empleados);
            out.println("<p>Empleados: " + data.obtenerNumeroDeEmpleados() + "</p>");
            out.println("<p>Empleados Masculino: " + data.obtenerNumeroDeEmpleadosMasculino() + "</p>");
            out.println("<p>Empleados Femenino: " + data.obtenerNumeroDeEmpleadosFemenino() + "</p>");
            out.println("<p>Empleado Salario Menor: " + data.obtenerEmpleadoSalarioMenor().getNombre() + "</p>");
            out.println("<p>Empleado Salario Mayor: " + data.obtenerEmpleadoSalarioMayor().getNombre() + "</p>");
            out.println("<p>Salario Promedio: " + data.obtenerSalarioPromedio() + "</p>");
        %>
    </body>
</html>
