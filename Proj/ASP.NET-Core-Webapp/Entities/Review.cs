﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ASP.NET_Core_Webapp.Entities
{
    public class Review
    {
        public long ReviewId { get; set; }
        public string Message { get; set; }
        public string Status { get; set; }
        public User User { get; set; }
        public Pitch Pitch { get; set; }
    }
}
