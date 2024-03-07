package com.company.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.todo.dto.TodoDTO;
import com.company.todo.repository.TodoRepository;

@Service
public class TodoServiceImp implements TodoService {

   @Autowired //해당 클래스의 객체를 자동으로 생성하고 해당 클래스가 필요로 하는 다른 객체(Bean)를 주입
   private TodoRepository todoRepository;
   
   public TodoServiceImp() {

   }
   
   @Override
   public List<TodoDTO> search() throws Exception {
      return todoRepository.getTodoList();
      // 서비스 -> 레포지토리 -> 매퍼 -> 레포지토리 -> 서비스 -> 컨트롤러
   }

   @Override
   public int insert(TodoDTO dto) throws Exception {
      // TODO Auto-generated method stub
      return todoRepository.insertTodoList(dto);
   }

   @Override
   public int update(TodoDTO dto) throws Exception {
       return todoRepository.updateTodoList(dto);
   }

   @Override
   public int delete(int id) throws Exception {
       return todoRepository.deleteTodoList(id);
   }

}