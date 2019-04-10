using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication4.modells;

namespace WebApplication4.controllers
{
    [Route("api")]
    public class RestController : Controller
    {
        
        static long counter = 0;

        public IActionResult Index()
        {
            return View();
        }

        [HttpGet]
        [Route("greeting")]
        //Note that this could be replaced with just a single [HttpGet("greeting")] attribute.
        public Greeting Greet([FromQuery] string name)
        {
            Greeting greet = new Greeting(counter, name);
            counter++;
            return greet;
        }
        
    }
}