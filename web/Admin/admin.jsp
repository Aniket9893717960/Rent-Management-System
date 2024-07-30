<%-- 
    Document   : admin
    Created on : 14 Jul, 2023, 9:57:23 AM
    Author     : INDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="admin.css" >
    </head>
    <body>
        <section class="admin">
    <div class="ad">
      <div class="feature1">
          <h2>AlERT</h2>
          <strong><p>This option will be usable to only admin not for landlord,occupier.The admin tasks will
          be classified by three sub categories</p>
          <p>Request Accepting assistant</p>
          <p>Design Changes</p>
          <p>Checker for performed action</p></strong>
      </div>
      <div class="feature2">
          <form>
              <select name="options">
                  <option value="Request Accepting assistant">Request Accepting assistant</option>
                  <option value="Design Changes">Design Changes</option>
                  <option value="Checker for performed action">Checker for performed action</option>
              </select>
          </form>
      </div>
    </div>
      </section>
    </body>
</html>
