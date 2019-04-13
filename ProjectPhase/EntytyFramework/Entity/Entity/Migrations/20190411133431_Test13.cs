using Microsoft.EntityFrameworkCore.Migrations;

namespace Entity.Migrations
{
    public partial class Test13 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_Idegenkulcs",
                table: "Todos");

            migrationBuilder.DropIndex(
                name: "IX_Todos_Idegenkulcs",
                table: "Todos");

            migrationBuilder.AddColumn<long>(
                name: "assigneeId",
                table: "Todos",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Todos_assigneeId",
                table: "Todos",
                column: "assigneeId");

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

            migrationBuilder.DropIndex(
                name: "IX_Todos_assigneeId",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "assigneeId",
                table: "Todos");

            migrationBuilder.CreateIndex(
                name: "IX_Todos_Idegenkulcs",
                table: "Todos",
                column: "Idegenkulcs");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_Idegenkulcs",
                table: "Todos",
                column: "Idegenkulcs",
                principalTable: "Assignees",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
