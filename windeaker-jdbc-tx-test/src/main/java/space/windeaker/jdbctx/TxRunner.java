package space.windeaker.jdbctx;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/6
 */
public class TxRunner {

	final static DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyMMddHHmmss");

	SysAccountService accountService;

	ConfigurableApplicationContext context;

	@Before
	public void before(){
		context=new ClassPathXmlApplicationContext("classpath:tx.xml");
		accountService = context.getBean(SysAccountService.class);
	}

	@After
	public void after(){
		context.close();
	}

	@Test
	public void testSave(){
		SysAccount param=new SysAccount();
		String s = LocalDateTime.now().format(dtf);
		param.setNickName("tnick".concat(s));
		param.setAccount("taccount".concat(s));
		param.setPwdDigest("tpwd".concat(s));
		param.setDigestSalt("tsalt".concat(s));
		Date now=new Date();
		param.setCstModified(now);
		param.setCstCreated(now);
		accountService.insertException(param);
	}


}
