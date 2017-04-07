import org.eclipse.jetty.servlet.ServletContextHandler;
import sun.misc.Request;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/")
public class MyServer extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //String b =servletContext.getResourceAsStream("/WEB-INF/config.xml");
        ServletContext servletContext = getServletContext();
        String WarPath = servletContext.getRealPath("/WEB-INF/config.xml");
        String Directory = WarPath.substring(0,WarPath.indexOf("jetty-0.0.0.0"));


        List<String> result = new ArrayList();
        //String fileNameToSearch = "MANIFEST.MF";
        File[] filesList;
        File filesPath = new java.io.File(Directory);
        filesList = filesPath.listFiles();
        for(int i=0; i<filesList.length; i++){
            String buf = filesList[i].getName(); // читаем текущее имя файла
            if(buf.equals("MANIFEST.MF")){  // если заканчивается на .txt, то меняем на .java
                result.add(buf);
            }
        }
        request.setAttribute("qwerty", WarPath);
        request.setAttribute("index", result);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String jettyHome = System.getProperty("");
        request.setAttribute("qwerty", "321321");
        request.getRequestDispatcher("result.jsp").forward(request,response);

}
}