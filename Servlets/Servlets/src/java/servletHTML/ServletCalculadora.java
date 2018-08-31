package servletHTML;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;
public class ServletCalculadora extends HttpServlet {
     String nombre;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("NOMBRE");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Calculadora</title></head>");
        out.println("<body>");
        out.println("<div class=\"content\">\n" +
"	<h2>Calculadora</h2>\n" +
"	<form method=\"post\" action=\"calcular\">\n" +
"		<div id=\"formularioCalculadora\">\n" +
"		<table>");
        out.println("<tr>\n" +
"				<td>Ingrese un n&uacute;mero</td>\n <p value='"+nombre+"'></p>" +
"				<td><input type=\"text\" name=\"arg1\" value=\"\"/></td>\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td>Otro</td>\n" +
"				<td><input type=\"text\" name=\"arg2\" value=\"\"/></td>\n" +
"			</tr>\n" +
"			<tr class=\"botones\">\n" +
"				<td colspan=\"2\"><input type=\"submit\" value=\"Sumar\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"Restar\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"Multiplicar\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"Dividir\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"Sen\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"log\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"log10\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"cos\" /></td>\n <td colspan=\"2\"><input type=\"submit\" value=\"tan\" /></td>\n    " +
"			</tr>\n" +
"		</table>\n" +
"		</div>\n" +
"		 \n" +
"	</form>\n" +
"</div>");
        out.println("</body></html>");
        
                 out.close();
                 
    }
}
