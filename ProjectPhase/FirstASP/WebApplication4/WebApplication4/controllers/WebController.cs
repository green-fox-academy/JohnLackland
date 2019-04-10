﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication4.modells;

namespace WebApplication4.controllers
{
    [Route("web")]
        public class WebController : Controller
        {
            [HttpGet("greeting")]
            public IActionResult Greeting()
            {
                var greeting = new Greeting()
                {
                    Id = 1,
                    Content = "from the model"
                };

                return View(greeting);
            }
        }
}