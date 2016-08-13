package servlet;

import java.util.Queue;

import javax.annotation.Resource;
import javax.jms.Topic;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/config")
public class ConfigServlet extends HttpServlet{

	@Resource
    private Queue queuePedido;

    @Resource
    private Topic topicVenda;

}