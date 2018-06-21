package com.mattdamon.logback.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mattdamon.logback.service.LogbackService;

@Controller
@RequestMapping(value = "test")
public class LogbackController {

	@Autowired
	private LogbackService logbackService;

	private static Logger log = LoggerFactory
			.getLogger(LogbackController.class);

	// DEMO: 前后端同过AJAX方式请求
	@RequestMapping(value = "/ajax.do", method = RequestMethod.GET)
	@ResponseBody
	public String test(HttpServletRequest request) {

		log.info(" [MYAPP-ACCESS-LOG-CATEGROY] ");
		log.debug(" [MYAPP-ACCESS-LOG-CATEGROY] ");

		log.debug(" [MYAPP-SYSTEM-LOG-CATEGROY] ");
		log.info(" [MYAPP-SYSTEM-LOG-CATEGROY] ");

		log.debug(" [MYAPP-CONTROLLER-LOG-CATEGROY] alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk");
		logbackService.test();
		return "{'result':'success'}";
	}

}
