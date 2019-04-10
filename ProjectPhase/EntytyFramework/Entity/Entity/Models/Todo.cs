using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Entity.Models
{
    public class Todo
    {
        public long Id { get; set; }
        public string Title { get; set; }
        public bool IsUrgent { get; set; }
        public bool IsDone { get; set; }

        public Todo()
        {
            IsDone = false;
            IsUrgent = false;
        }

        public Todo(string title)
        {
            Title = title;
            IsDone = false;
            IsUrgent = false;
        }
    }
}
