﻿// <auto-generated />
using System;
using ASP.NET_Core_Webapp;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

namespace ASP.NET_Core_Webapp.Migrations
{
    [DbContext(typeof(ApplicationContext))]
    [Migration("20190425090916_joiningTable")]
    partial class joiningTable
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.2.4-servicing-10062")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.Badge", b =>
                {
                    b.Property<long>("BadgeId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Name");

                    b.Property<string>("Tag");

                    b.Property<string>("Version");

                    b.HasKey("BadgeId");

                    b.ToTable("Badges");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.BadgeLevel", b =>
                {
                    b.Property<long>("BadgeLevelId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<long?>("BadgeId");

                    b.Property<string>("Description");

                    b.Property<int>("Level");

                    b.Property<long?>("UserId");

                    b.HasKey("BadgeLevelId");

                    b.HasIndex("BadgeId");

                    b.HasIndex("UserId");

                    b.ToTable("BadgeLevels");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.Pitch", b =>
                {
                    b.Property<long>("PitchId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<long?>("BadgeId");

                    b.Property<long?>("BadgeLevelId");

                    b.Property<string>("PitchMessage");

                    b.Property<int>("PitchedLevel");

                    b.Property<DateTime>("TimeStamp");

                    b.Property<long?>("UserId");

                    b.HasKey("PitchId");

                    b.HasIndex("BadgeId");

                    b.HasIndex("BadgeLevelId");

                    b.HasIndex("UserId");

                    b.ToTable("Pitches");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.Review", b =>
                {
                    b.Property<long>("ReviewId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Message");

                    b.Property<long?>("PitchId");

                    b.Property<string>("Status");

                    b.Property<long?>("UserId");

                    b.HasKey("ReviewId");

                    b.HasIndex("PitchId");

                    b.HasIndex("UserId");

                    b.ToTable("Reviews");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.User", b =>
                {
                    b.Property<long>("UserId")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Email");

                    b.Property<string>("Namee");

                    b.Property<string>("OpenId");

                    b.Property<string>("Picture");

                    b.HasKey("UserId");

                    b.ToTable("Users");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.BadgeLevel", b =>
                {
                    b.HasOne("ASP.NET_Core_Webapp.Entities.Badge", "Badge")
                        .WithMany("Levels")
                        .HasForeignKey("BadgeId");

                    b.HasOne("ASP.NET_Core_Webapp.Entities.User")
                        .WithMany("BadgeLevels")
                        .HasForeignKey("UserId");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.Pitch", b =>
                {
                    b.HasOne("ASP.NET_Core_Webapp.Entities.Badge", "Badge")
                        .WithMany()
                        .HasForeignKey("BadgeId");

                    b.HasOne("ASP.NET_Core_Webapp.Entities.BadgeLevel", "BadgeLevel")
                        .WithMany()
                        .HasForeignKey("BadgeLevelId");

                    b.HasOne("ASP.NET_Core_Webapp.Entities.User", "User")
                        .WithMany()
                        .HasForeignKey("UserId");
                });

            modelBuilder.Entity("ASP.NET_Core_Webapp.Entities.Review", b =>
                {
                    b.HasOne("ASP.NET_Core_Webapp.Entities.Pitch", "Pitch")
                        .WithMany("Holders")
                        .HasForeignKey("PitchId");

                    b.HasOne("ASP.NET_Core_Webapp.Entities.User", "User")
                        .WithMany()
                        .HasForeignKey("UserId");
                });
#pragma warning restore 612, 618
        }
    }
}
