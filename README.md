# EJB
- A servlet calls an enterprise bean. The servlet is the client.
- There is no need to set up the deployment descriptor for the servlet as the URL is defined per annotation (@WebServlet("/..."))
- Both, the servlet and the EJB, are deployed in the server.
- There is also a client packet which call the remote ejb using JDNI. Add gf-client.jar for glassfish!
