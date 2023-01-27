import com.shaoyx.mybatis.mapper.CacheMapper;
import com.shaoyx.mybatis.pojo.Cache;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Date:2023/1/27
 *
 * @author SYX
 */
public class CacheMapperTest {

    @Test
    public void selectOneByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Cache cache = mapper.selectOneByEmpId(1);
        System.out.println(cache);

        mapper.updateAgeByEmpId(21, 1);

        Cache cache2 = mapper.selectOneByEmpId(1);
        System.out.println(cache2);


        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Cache cache3 = mapper.selectOneByEmpId(1);
        System.out.println(cache3);

    }

    @Test
    public void firstCache() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Cache cache = mapper.selectOneByEmpId(1);
        System.out.println(cache);

        sqlSession.clearCache();

        Cache cache2 = mapper.selectOneByEmpId(1);
        System.out.println(cache2);


        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Cache cache3 = mapper.selectOneByEmpId(1);
        System.out.println(cache3);

    }
}
