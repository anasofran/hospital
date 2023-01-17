<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Empleados</title>
    <link href="../css/index.css" rel="stylesheet" type="text/css" />
    <link href="../css/screen.css" rel="stylesheet" type="text/css" />
    <link href="../css/dashboard.css" rel="stylesheet" type="text/css" />
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
            ArrayList<Paciente> pacientes = ctrPaciente.consultarPacientes();
            PacienteEstadisticas data = new PacienteEstadisticas(pacientes);
    %>
    <section class="page page-screen page-dashboard">
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
          <h2 class="page-header-name">Empleado</h2>
        </div>
        <div class="page-header-links">
          <a
            class="link-primary page-header-link page-header-link-mg"
            href="consultar.jsp"
            >Ver todos</a
          >
          <a class="link-primary page-header-link" href="agregar.jsp"
            >Agregar paciente +</a
          >
        </div>
      </header>
      <main class="page-main">
        <div class="dashboard-content">
          <div class="dashboard-card">
            <p class="dashboard-card-title"><% out.println(data.obtenerNumeroDePacientes()); %></p>
            <div class="dashboard-card-shape">
              <svg width="50%" height="50%" fill="white" viewBox="0 0 16 16">
                <path
                  d="M15 14s1 0 1-1-1-4-5-4-5 3-5 4 1 1 1 1h8Zm-7.978-1A.261.261 0 0 1 7 12.996c.001-.264.167-1.03.76-1.72C8.312 10.629 9.282 10 11 10c1.717 0 2.687.63 3.24 1.276.593.69.758 1.457.76 1.72l-.008.002a.274.274 0 0 1-.014.002H7.022ZM11 7a2 2 0 1 0 0-4 2 2 0 0 0 0 4Zm3-2a3 3 0 1 1-6 0 3 3 0 0 1 6 0ZM6.936 9.28a5.88 5.88 0 0 0-1.23-.247A7.35 7.35 0 0 0 5 9c-4 0-5 3-5 4 0 .667.333 1 1 1h4.216A2.238 2.238 0 0 1 5 13c0-1.01.377-2.042 1.09-2.904.243-.294.526-.569.846-.816ZM4.92 10A5.493 5.493 0 0 0 4 13H1c0-.26.164-1.03.76-1.724.545-.636 1.492-1.256 3.16-1.275ZM1.5 5.5a3 3 0 1 1 6 0 3 3 0 0 1-6 0Zm3-2a2 2 0 1 0 0 4 2 2 0 0 0 0-4Z"
                />
              </svg>
            </div>
            <p class="dashboard-card-desc">
              Número total de pacientes
            </p>
          </div>
          <div class="dashboard-card">
            <p class="dashboard-card-title"><% out.println(data.obtenerEdadPromedio()); %></p>
            <div class= "dashboard-card-shape">
              <svg width="50%" height="50%" fill="white" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M8 1a4 4 0 1 0 0 8 4 4 0 0 0 0-8zM3 5a5 5 0 1 1 5.5 4.975V12h2a.5.5 0 0 1 0 1h-2v2.5a.5.5 0 0 1-1 0V13h-2a.5.5 0 0 1 0-1h2V9.975A5 5 0 0 1 3 5z"/>
              </svg>
            </div>
            <p class="dashboard-card-desc">
              Promedio de edad de los empleados
            </p>
          </div>
          <div class="dashboard-card">
            <p class="dashboard-card-title"><% out.println(data.obtenerMayorAfiliado()); %></p>
            <div class="dashboard-card-shape">
              <svg width="50%" height="50%" fill="white" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M9.5 2a.5.5 0 0 1 0-1h5a.5.5 0 0 1 .5.5v5a.5.5 0 0 1-1 0V2.707L9.871 6.836a5 5 0 1 1-.707-.707L13.293 2H9.5zM6 6a4 4 0 1 0 0 8 4 4 0 0 0 0-8z"/>
              </svg>
            </div>
            <p class="dashboard-card-desc">
              Paciente con mayor tiempo de afiliacion
            </p>
          </div>
          <div class="dashboard-card">
            <p class="dashboard-card-title"><% out.println(data.obtenerMenorAfiliado()); %></p>
            <div class="dashboard-card-shape">
              <svg width="50%" height="50%" fill="white" viewBox="0 0 16 16">
                <path d="M8 10a2 2 0 1 0 0-4 2 2 0 0 0 0 4z"/>
                <path d="M0 4a1 1 0 0 1 1-1h14a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1H1a1 1 0 0 1-1-1V4zm3 0a2 2 0 0 1-2 2v4a2 2 0 0 1 2 2h10a2 2 0 0 1 2-2V6a2 2 0 0 1-2-2H3z"/>
              </svg>
            </div>
            <p class="dashboard-card-desc">
              Paciente con menor tiempo de afiliacion
            </p>
          </div>
          <div class="dashboard-card">
            <p class="dashboard-card-title"><% out.println(data.diagnosticoVocal()); %></p>
            <div class="dashboard-card-shape">
              <svg width="50%" height="50%" fill="white" viewBox="0 0 16 16">
                <path fill-rule="evenodd" d="M11 15a4 4 0 1 0 0-8 4 4 0 0 0 0 8zm5-4a5 5 0 1 1-10 0 5 5 0 0 1 10 0z"/>
                <path d="M9.438 11.944c.047.596.518 1.06 1.363 1.116v.44h.375v-.443c.875-.061 1.386-.529 1.386-1.207 0-.618-.39-.936-1.09-1.1l-.296-.07v-1.2c.376.043.614.248.671.532h.658c-.047-.575-.54-1.024-1.329-1.073V8.5h-.375v.45c-.747.073-1.255.522-1.255 1.158 0 .562.378.92 1.007 1.066l.248.061v1.272c-.384-.058-.639-.27-.696-.563h-.668zm1.36-1.354c-.369-.085-.569-.26-.569-.522 0-.294.216-.514.572-.578v1.1h-.003zm.432.746c.449.104.655.272.655.569 0 .339-.257.571-.709.614v-1.195l.054.012z"/>
                <path d="M1 0a1 1 0 0 0-1 1v8a1 1 0 0 0 1 1h4.083c.058-.344.145-.678.258-1H3a2 2 0 0 0-2-2V3a2 2 0 0 0 2-2h10a2 2 0 0 0 2 2v3.528c.38.34.717.728 1 1.154V1a1 1 0 0 0-1-1H1z"/>
                <path d="M9.998 5.083 10 5a2 2 0 1 0-3.132 1.65 5.982 5.982 0 0 1 3.13-1.567z"/>
              </svg>
            </div>
            <p class="dashboard-card-desc">
                Pacientes con diagnostico con inicio en vocal
            </p>
        </div>
        </div>
      </main>
      <footer class="page-footer">Hospital Melgarejo 2022</footer>
    </section>
  </body>
</html>
