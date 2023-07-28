package com.example.exercice_cicd;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }
    public Todo addTodo(Todo todo){
      return todoRepository.save(todo);
    }

    public String deleteTodo(int id){
        Todo todo = this.getTodo(id);
        if(todo!=null){
            return todo.getId()+"deleted";
        }
        else
        {
            return todo.getId()+"not deleted";
        }
    }
    public Todo getTodo(int id){
       Todo todo = todoRepository.findById(id).orElse(null);
       if(todo!=null){
           return todo;
       }
       else
       {
           return null;
       }
    }

}
