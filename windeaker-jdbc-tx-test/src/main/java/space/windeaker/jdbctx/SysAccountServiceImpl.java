package space.windeaker.jdbctx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/6
 */
public class SysAccountServiceImpl implements SysAccountService {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate=new JdbcTemplate(dataSource);
	}

	@Override
	public List<SysAccount> select(Integer id,String nickname) {
		return jdbcTemplate.query("select * from sys_account where id=? and nick_name like concat('%',?,'%') ",new Object[]{id,nickname},new int[]{Types.INTEGER,Types.VARCHAR},new SysAccountRowMapper());
	}

	@Override
	public int insert(SysAccount account) {
		return jdbcTemplate.update("insert into sys_account  (id,deleted,cst_created,cst_modified,account,nick_name,pwd_digest,digest_salt ) values (?,?,?,?,?,?,?,? )",
				account.getId(),account.isDeleted(),account.getCstCreated(),account.getCstModified(),account.getAccount(),account.getNickName(),account.getPwdDigest(),account.getDigestSalt());

	}

	@Override
	public int insertException(SysAccount account) {
		int result= jdbcTemplate.update("insert into sys_account  (id,deleted,cst_created,cst_modified,account,nick_name,pwd_digest,digest_salt ) values (?,?,?,?,?,?,?,? )",
				account.getId(),account.isDeleted(),account.getCstCreated(),account.getCstModified(),account.getAccount(),account.getNickName(),account.getPwdDigest(),account.getDigestSalt());
		throw new RuntimeException("故意抛出的异常");
	}

	@Override
	public int update(SysAccount param) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return 0;
	}
}
