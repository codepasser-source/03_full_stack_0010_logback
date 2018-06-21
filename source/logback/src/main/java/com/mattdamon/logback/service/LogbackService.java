package com.mattdamon.logback.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mattdamon.logback.dao.LogbackDao;

@Service
public class LogbackService {

	private static Logger log = LoggerFactory.getLogger(LogbackService.class);

	@Autowired
	private LogbackDao logbackDao;

	public void test() {
		log.debug(" [MYAPP-SERVICE-LOG-CATEGROY] ;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk;alskjdflkjas;ldfkja;lksjdflkajsdflkja;slkdjf;akjsdf;kjas;ldkfja;lksjfd;lkajsdflja;sldkfj;alksjdf;lkajsdf;lkjal;skdfj;alksdjf;lakjsd;flkja;lsdk");
		logbackDao.test();
	}
}
