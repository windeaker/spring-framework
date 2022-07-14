package space.windeaker.jdbctx;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/6
 */
public class SysAccountRowMapper implements RowMapper<SysAccount> {
	@Override
	public SysAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
		SysAccount result = new SysAccount();
		result.setId(rs.getInt("id"));
		result.setDeleted(rs.getBoolean("deleted"));
		result.setCstCreated(rs.getDate("cst_created"));
		result.setCstModified(rs.getDate("cst_modified"));
		result.setAccount(rs.getString("id"));
		result.setNickName(rs.getString("nick_name"));
		result.setPwdDigest(rs.getString("digest_salt"));
		result.setDigestSalt(rs.getString("digest_salt"));
		return result;
	}
}
