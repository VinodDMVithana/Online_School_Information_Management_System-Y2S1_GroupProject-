package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import service.BookService;

/**
 * Servlet implementation class UpdateBook
 */
@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String bookName = request.getParameter("bookName");
		String isbnNumber = request.getParameter("isbnNumber");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		String type = request.getParameter("type");
		
		Book b = new Book(bookName,isbnNumber,author,publisher,type);
		b.setId(id);
		
		BookService bookService = new BookService(request,response);
		bookService.updateBook(b);
		
		response.sendRedirect("Pradeepa/view_book.jsp");
		
	}

}
