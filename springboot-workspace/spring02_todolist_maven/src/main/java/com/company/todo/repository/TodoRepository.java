package com.company.todo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.company.todo.dto.TodoDTO;

/*
[TodoList API URI 설계]
조회   /todo/all                 GET
등록   /todo                     POST
수정   /todo/{id}/{completed}    PUT
삭제   /todo/{id}                DELETE
*/
// 다른 도메인에 대하여 접근허용
//@CrossOrigin(origins = {"http://127.0.0.1:3000"})
@CrossOrigin("*")
@Mapper
@Repository  // 어노테이션 이걸로 설정하면 알아서 설정됨  - db와 연결
//- @Mapper 랑연결 해야됨대신(xml메퍼에 주소작성과 @Mapper로연결)
// 자동으로 메소드 이름이 id로 적용이 된다 mapper에 설정은 해줘야함
public interface TodoRepository {
	public List<TodoDTO> getTodoList() throws Exception;
	public int insertTodoList(TodoDTO dto) throws Exception;
	public int updateTodoList(TodoDTO dto) throws Exception;
	public int deleteTodoList(int id) throws Exception;
}
