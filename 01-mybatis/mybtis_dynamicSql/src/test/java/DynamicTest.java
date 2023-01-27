import com.shaoyx.mybatis.mapper.EmpMapper;
import com.shaoyx.mybatis.pojo.Emp;
import com.shaoyx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DynamicTest {

    @Test
    public void selectOneByEmpId() {
    }

    @Test
    public void selectByAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp(null, "", null, "男");

        List<Emp> empList = mapper.selectByAll(emp);
        empList.forEach(System.out::println);

    }

    @Test
    public void insertList() {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(null, "测试1", 20, "男");
        Emp emp2 = new Emp(null, "测试2", 21, "男");
        Emp emp3 = new Emp(null, "测试3", 22, "男");
        Emp emp4 = new Emp(null, "测试4", 23, "男");
        List<Emp> empList = Arrays.asList(emp1, emp2, emp3, emp4);
        mapper.insertList(empList);
    }

    @Test
    public void deleteByEmpIdIn() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Collection<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);

        int i = mapper.deleteByEmpIdIn(collection);
        System.out.println(i);
    }


}