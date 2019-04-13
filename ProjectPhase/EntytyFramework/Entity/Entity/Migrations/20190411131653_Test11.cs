using Microsoft.EntityFrameworkCore.Migrations;

namespace Entity.Migrations
{
    public partial class Test11 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignee_assigneeId",
                table: "Todos");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Assignee",
                table: "Assignee");

            migrationBuilder.RenameTable(
                name: "Assignee",
                newName: "Assignees");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Assignees",
                table: "Assignees",
                column: "Id");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_assigneeId",
                table: "Todos",
                column: "assigneeId",
                principalTable: "Assignees",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_assigneeId",
                table: "Todos");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Assignees",
                table: "Assignees");

            migrationBuilder.RenameTable(
                name: "Assignees",
                newName: "Assignee");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Assignee",
                table: "Assignee",
                column: "Id");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignee_assigneeId",
                table: "Todos",
                column: "assigneeId",
                principalTable: "Assignee",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
