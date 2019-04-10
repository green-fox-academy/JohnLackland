using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using BankOfSimba.Models;
using Microsoft.AspNetCore.Mvc;

namespace BankOfSimba.Controllers
{   [Route("")]
    public class MainController : Controller
    {
        public static List<BankAccount> accountList = new List<BankAccount>()
        {
            new BankAccount("Simba", 2000, "lion",true),
            new BankAccount("Timon", 200, "mungoose",false),
            new BankAccount("Pumba", 350, "wart-hog",false),
            new BankAccount("Ed", 800, "hyena", false),
            new BankAccount("Mufasa", 3000, "lion", false),
            new BankAccount("Zazu", 1000, "toucan", false),
            new BankAccount("Nala", 1500, "lion", false),
            new BankAccount("Shenzi", 900, "hyena", false)
        };

        [HttpGet("show")]
        public IActionResult Index()
        {
            BankAccount account = new BankAccount("Simba", 2000, "lion", true);
            return View(account);
        }

        [HttpGet("same")]
        public IActionResult Format()
        {
            ViewData["text"] = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
            return View();
        }

        [HttpGet("showall")]
        public IActionResult ShowAll()
        {
            return View(accountList);
        }

        [HttpPost("add")]
        public IActionResult Add(BankAccount bank)
        {
            accountList.Add(bank);
            return RedirectToAction("showall");
        }
    }
}