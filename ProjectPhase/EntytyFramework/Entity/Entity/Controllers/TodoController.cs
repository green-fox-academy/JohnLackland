using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Entity.Models;
using Microsoft.AspNetCore.Mvc;

namespace Entity.Controllers
{   [Route("Todo")]
    public class TodoController : Controller
    {
        [HttpGet("")]
        [HttpGet("list")]
        public IActionResult List()
        {
            List<Todo> list = new List<Todo>();
            list.Add(new Todo("test 3"));
            list.Add(new Todo("szar"));
            list.Add(new Todo("test2"));
            list.Add(new Todo("proba proba"));

            return View(list);
        }
    }
}