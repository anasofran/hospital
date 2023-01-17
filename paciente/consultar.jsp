<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Paciente</title>
    <link href="../css/index.css" rel="stylesheet" type="text/css" />
    <link href="../css/screen.css" rel="stylesheet" type="text/css" />
    <link href="../css/table.css" rel="stylesheet" type="text/css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <%
      ControladorPaciente ctrPaciente = new ControladorPaciente();
      ctrPaciente.conectar();
      ArrayList<Paciente> pacientes = ctrPaciente.consultarPacientes("");
    %>
    <section class="page page-screen page-table">
      <header class="page-header">
        <div class="page-header-nav">
          <div class="page-header-back" onclick="history.back()">
            <svg width="16" height="16" viewBox="0 0 16 16" fill="currentColor">
              <path
                fill-rule="evenodd"
                d="M12 8a.5.5 0 0 1-.5.5H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5a.5.5 0 0 1 .5.5z"
              />
            </svg>
          </div>
          <h2 class="page-header-name">Todos los pacientes</h2>
        </div>
      </header>
      <main class="page-main">
        <div class="page-table-head">
          <button
            type="button"
            class="btn btn-danger"
            data-bs-toggle="modal"
            data-bs-target="#exampleModal"
          >
            Borrar paciente
          </button>
        </div>
        <div class="table-responsive">
          <table class="table table-hover table-fixed">
            <thead>
              <tr>
                <th scope="col">NSS</th>
                <th scope="col">Nombre</th>
                <th scope="col">Edad</th>
                <th scope="col">Diagnostico</th>
        
              </tr>
            </thead>
            <tbody>
              <% 
                for (Paciente paci: pacientes){
                    out.println("<tr><td scope='row'>" + e.getNSS() + "</td>");
                    out.println("<td>" + e.getNombre() + "</td>");
                    out.println("<td>" + e.getEdad()+ "</td>");
                    out.println("<td>" + e.getDiagnostico() + "</td>");
                    out.println("<td>$" + String.format("%,.2f", e.getSalario()) + "</td></tr>");
                }
              %>
            </tbody>
          </table>
        </div>
      </main>
      <footer class="page-footer">Hospital Melgarejo 2022</footer>
    </section>
    <div
      class="modal fade"
      id="exampleModal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="exampleModalLabel">
              Borrar paciente
            </h1>
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="modal"
              aria-label="Close"
            ></button>
          </div>
          <div class="modal-body">
            <form method="post" action="eliminarAction.jsp">
              <div class="page-table-field-delete">
                <label class="form-label">Número de empleado</label>
                <input
                  type="text"
                  class="form-control"
                  id="NSS"
                  name="NSS"
                  placeholder="Ingrese su número de seguridad social."
                  required
                />
              </div>
              <button type="submit" class="btn btn-danger">Eliminar</button>
            </form>
          </div>
        </div>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
