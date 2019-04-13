using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Entity.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace Entity.Controllers
{
    public class TodoController : Controller
    {
        private readonly ApplicationContext applicationContext;

        public TodoController(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }
        [HttpGet("test")]
        public IActionResult Index()
        {
            // Create a SQL query in the background
            var todos = applicationContext.Todos.ToList();

            return View(todos);
        }

        [HttpGet("")]
        [HttpGet("list")]
        public IActionResult List(string isActive = "")
        {

            if (isActive.Equals("true", StringComparison.InvariantCultureIgnoreCase))
            {
                return View(applicationContext.Todos.Where(n => !n.IsDone).ToList());
            }
            else if (isActive.Equals("false", StringComparison.InvariantCultureIgnoreCase))
            {
                return View(applicationContext.Todos.Where(n => n.IsDone).ToList());
            }

            var todos = applicationContext.Todos.ToList();

            return View(todos);
        }

        [HttpGet("/add")]
        [HttpGet("list/add")]
        public IActionResult Add()
        {
            return View();
        }

        [HttpPost("Add")]
        public IActionResult AddThis(Todo todo)
        {
            applicationContext.Add(todo);
            applicationContext.SaveChanges();

            return RedirectToAction("List");
        }

        [HttpDelete("{id}/delete")]
        public IActionResult DeleteThis([FromRoute]long id)
        {
            var entity = applicationContext.Todos.FirstOrDefault(n => n.Id == id);
            applicationContext.Remove(entity);
            applicationContext.SaveChanges();
            return RedirectToAction("List");
        }

        [HttpGet("{id}/edit")]
        public IActionResult EditTodoGet([FromRoute] long id)
        {
            var i = applicationContext.Todos.FirstOrDefault(n => n.Id == id);
            return Accepted(i);
        }

        [HttpPut("edit")]
        public IActionResult EDitTodoPut(Todo todo,long assigneId)
        {
            var i = applicationContext.Assignees.FirstOrDefault(n => n.Id == assigneId);
            todo.Assignee = i;
            applicationContext.Update(todo);
            applicationContext.SaveChanges();
            return Accepted(todo);
        }

        [HttpPost("addass")]
        public IActionResult AddAsignee(Assignee assignee)
        {
            applicationContext.Add(assignee);
            applicationContext.SaveChanges();
            return Accepted(assignee);
        }

        [HttpGet("GetAssigneTodo/{id}")]
        public Assignee Test(long id )
        {
            var i = applicationContext.Assignees.FirstOrDefault(a => a.Id == id);
               
            return i;
        }

        
        
    }
}