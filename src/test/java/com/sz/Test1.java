package com.sz;

import com.sz.dao.BookDao;
import com.sz.util.BookUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.sz.entity.bookEntity;

import java.util.List;

public class Test1 {

//    查询
    @Test
    public void mimili(){
        SqlSession sqlSession = BookUtil.getSesstion();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);
        List<bookEntity> listBook = bookDao.bookAll();
        System.out.println(listBook);

    }


}
