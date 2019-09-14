import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @Author: liuwei
 * @Date: 2019/9/12 0012 18:50
 */
@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
// 3秒后跳转到黑马官网
        // 设置一个响应头  refresh
        //response.setHeader("refresh","3;url=http://www.itheima.com");
        response.setHeader("refresh","3;url=http://localhost:63342/dian/index.html?_ijt=h73attp42kphuhm4kka6m8p881");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}

