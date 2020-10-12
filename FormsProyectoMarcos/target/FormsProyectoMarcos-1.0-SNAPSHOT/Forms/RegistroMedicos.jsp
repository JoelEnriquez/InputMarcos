
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="/WEB-INF/Extras/CSS.jsp"/> 
    </head>
    <body>
        <h1>Form Registro Medicos</h1>
        <br>
        <form>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Nombre</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="nombre" required>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Numero de Colegiado</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="colegiado" required>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">DPI</label>
                <div class="col-sm-10">
                    <input type="number"  min="1111111111111" max="9999999999999" class="form-control" name="DPI" required>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Numero de Telefono</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="colegiado" required>
                </div>
            </div>
        </form>


        <jsp:include page="/WEB-INF/Extras/JS.jsp"/>
    </body>
</html>
