package com.octo.captcha.module.servlet.image.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;

public class SubmitActionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7342121576411594220L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCaptchaResponse = request.getParameter("japtcha");
		boolean captchaPassed = SimpleImageCaptchaServlet.validateResponse(request, userCaptchaResponse);
		if (captchaPassed) {
			response.getWriter().write("captcha passed");
		} else {
			response.getWriter().write("captcha failed");
		}
		response.getWriter().write("<br/><a href='index.jsp'>Try again</a>");
	}
}