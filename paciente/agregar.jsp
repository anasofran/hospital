<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Agregar paciente</title>
    <link href="../css/index.css" rel="stylesheet" type="text/css" />
    <link href="../css/screen.css" rel="stylesheet" type="text/css" />
    <link href="../css/form.css" rel="stylesheet" type="text/css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <section class="page page-screen page-form">
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
          <h2 class="page-header-name">Agregar paciente</h2>
        </div>
      </header>
      <main class="page-main">
        <form
          method="post"
          action="agregarAction.jsp"
          class="page-form-container"
        >
          <div class="page-form-row page-form-row1">
            <div class="page-form-field">
              <label class="form-label">NSS</label>
              <input
                type="text"
                class="form-control"
                id="NSS"
                name="NSS"
                placeholder="Ingrese su número de seguridad social."
              />
            </div>
            <div class="page-form-field">
              <label class="form-label">Nombre</label>
              <input
                type="text"
                class="form-control"
                id="nombre"
                name="nombre"
                placeholder="Ej. Alfredo Martínez"
              />
            </div>
          </div>
          <div class="page-form-row page-form-row2">
            <div class="page-form-field">
              <label class="form-label">Edad</label>
              <input
                type="number"
                class="form-control"
                id="edad"
                name="edad"
                placeholder="Ej. 18"
              />
            </div>
            <div class="page-form-field">
              <label class="form-label">Diagnóstico</label>
              <input
                type="text"
                class="form-control"
                id="diagnostico"
                name="diagnostico"
                placeholder="Agregue su o sus diagnósticos separados por comas. Ej. Hipertensión, Diabetes,..."
                />
          
          </div>
          <button type="submit" class="btn btn-primary page-form-btn">
            Agregar
          </button>
        </form>
      </main>
      <footer class="page-footer">Hospital Melgarejo 2022</footer>
    </section>
  </body>
</html>
