using System;
using Microsoft.EntityFrameworkCore.Migrations;

namespace ASP.NET_Core_Webapp.Migrations
{
    public partial class multipleTables : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Pitches_Users_UserId",
                table: "Pitches");

            migrationBuilder.DropForeignKey(
                name: "FK_Reviews_Users_UserId",
                table: "Reviews");

            migrationBuilder.DropForeignKey(
                name: "FK_Users_BadgeLevels_BadgeLevelId",
                table: "Users");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Users",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "Created",
                table: "Pitches");

            migrationBuilder.RenameTable(
                name: "Users",
                newName: "StudentInfo2");

            migrationBuilder.RenameColumn(
                name: "Name",
                table: "StudentInfo2",
                newName: "Picture");

            migrationBuilder.RenameIndex(
                name: "IX_Users_BadgeLevelId",
                table: "StudentInfo2",
                newName: "IX_StudentInfo2_BadgeLevelId");

            migrationBuilder.AddColumn<DateTime>(
                name: "TimeStamp",
                table: "Pitches",
                nullable: false,
                defaultValue: new DateTime(1, 1, 1, 0, 0, 0, 0, DateTimeKind.Unspecified));

            migrationBuilder.AddColumn<string>(
                name: "Namee",
                table: "StudentInfo2",
                nullable: true);

            migrationBuilder.AddPrimaryKey(
                name: "PK_StudentInfo2",
                table: "StudentInfo2",
                column: "UserId");

            migrationBuilder.AddForeignKey(
                name: "FK_Pitches_StudentInfo2_UserId",
                table: "Pitches",
                column: "UserId",
                principalTable: "StudentInfo2",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Reviews_StudentInfo2_UserId",
                table: "Reviews",
                column: "UserId",
                principalTable: "StudentInfo2",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_StudentInfo2_BadgeLevels_BadgeLevelId",
                table: "StudentInfo2",
                column: "BadgeLevelId",
                principalTable: "BadgeLevels",
                principalColumn: "BadgeLevelId",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Pitches_StudentInfo2_UserId",
                table: "Pitches");

            migrationBuilder.DropForeignKey(
                name: "FK_Reviews_StudentInfo2_UserId",
                table: "Reviews");

            migrationBuilder.DropForeignKey(
                name: "FK_StudentInfo2_BadgeLevels_BadgeLevelId",
                table: "StudentInfo2");

            migrationBuilder.DropPrimaryKey(
                name: "PK_StudentInfo2",
                table: "StudentInfo2");

            migrationBuilder.DropColumn(
                name: "TimeStamp",
                table: "Pitches");

            migrationBuilder.DropColumn(
                name: "Namee",
                table: "StudentInfo2");

            migrationBuilder.RenameTable(
                name: "StudentInfo2",
                newName: "Users");

            migrationBuilder.RenameColumn(
                name: "Picture",
                table: "Users",
                newName: "Name");

            migrationBuilder.RenameIndex(
                name: "IX_StudentInfo2_BadgeLevelId",
                table: "Users",
                newName: "IX_Users_BadgeLevelId");

            migrationBuilder.AddColumn<string>(
                name: "Created",
                table: "Pitches",
                nullable: true);

            migrationBuilder.AddPrimaryKey(
                name: "PK_Users",
                table: "Users",
                column: "UserId");

            migrationBuilder.AddForeignKey(
                name: "FK_Pitches_Users_UserId",
                table: "Pitches",
                column: "UserId",
                principalTable: "Users",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Reviews_Users_UserId",
                table: "Reviews",
                column: "UserId",
                principalTable: "Users",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Users_BadgeLevels_BadgeLevelId",
                table: "Users",
                column: "BadgeLevelId",
                principalTable: "BadgeLevels",
                principalColumn: "BadgeLevelId",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
