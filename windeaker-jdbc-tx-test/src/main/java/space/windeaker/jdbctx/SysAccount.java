package space.windeaker.jdbctx;

import lombok.Data;

import java.util.Date;

/**
 * 账户实体类
 *
 * @author windeaker
 * @date 2022/7/6
 */
@Data
public class SysAccount {
	private int id;

	private boolean deleted;

	private Date cstCreated;

	private Date cstModified;

	private String account;

	private String nickName;

	private String pwdDigest;

	private String digestSalt;

}
