package space.windeaker.jdbctx;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/6
 */
@Transactional(propagation = Propagation.REQUIRED)
public interface SysAccountService {

	List<SysAccount> select(Integer id,String nickname);

	int insert(SysAccount param);

	int insertException(SysAccount param);

	int update(SysAccount param);

	int delete(int id);

}
