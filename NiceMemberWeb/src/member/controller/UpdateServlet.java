package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/member/update.kh")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정가능 :  아이디,비밀번호, 이메일, 주소, 폰, 취미
		request.setCharacterEncoding("UTF-8");
		String memeberId = request.getParameter("member-id");
		String memberPw = request.getParameter("member-pw");
		String memberEmail = request.getParameter("member-email");
		String memberAddress = request.getParameter("member-address");
		String memberPhone = request.getParameter("member-phone");
		String memberHobby = request.getParameter("member-hobby");
		Member member = new Member(memeberId, memberPw, memberEmail, memberAddress, memberPhone, memberHobby);
		MemberService mService = new MemberService();
		int result = mService.updateMember(member);
		if(result > 0) {
			// 성공하면 메인페이지
			response.sendRedirect("/index.jsp");
		}else {
			// 실패하면 에러페이지
			request.setAttribute("title", "정보 수정 실패");
			request.setAttribute("msg", "회원 정보 수정이 완료되지 않았습니다.");
			request.getRequestDispatcher("/WEB-INF/views/member/error.jsp").forward(request, response);
		}
	}

}
