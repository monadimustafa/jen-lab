package com.example.exercice_cicd;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class TodoController {

    private TodoService todoService;
    @GetMapping("/")
    public List getTodos(){
        return todoService.getTodos();
    }
    @GetMapping("/{todoId}")
    public Todo getTodo(@PathVariable("todoId")int id){
        return todoService.getTodo(id);
    }
    @PostMapping("")
    public Todo addTodo(@RequestBody Todo todo){
        Todo todosaved = todoService.addTodo(todo);
        return todosaved;
    }
    @PutMapping("{todoId}")
    public Todo updateTodo(@PathVariable("todoId")int id,@RequestBody Todo todo){
        Todo todoSearch = todoService.getTodo(id);
        todo.setId(todoSearch.getId());
        return todoService.addTodo(todo);
    }
    @DeleteMapping("{todoId}")
    public String deleteTodo(@PathVariable("todoId")int id){
        return todoService.deleteTodo(id);
    }

}
