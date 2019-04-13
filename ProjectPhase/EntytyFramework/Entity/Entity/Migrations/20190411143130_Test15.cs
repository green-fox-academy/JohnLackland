using Microsoft.EntityFrameworkCore.Migrations;

namespace Entity.Migrations
{
    public partial class Test15 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_Idegenkulcs",
                table: "Todos");

            migrationBuilder.DropIndex(
                name: "IX_Todos_Idegenkulcs",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "Idegenkulcs",
                table: "Todos");

            migrationBuilder.AddColumn<long>(
                name: "AssigneeId",
                table: "Todos",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Todos_AssigneeId",
                table: "Todos",
                column: "AssigneeId");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignees_AssigneeId",
                table: "Todos",
                column: "AssigneeId",
                principalTable: "Assignees",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignees_AssigneeId",
                table: "Todos");

            migrationBuilder.DropIndex(
                name: "IX_Todos_AssigneeId",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "AssigneeId",
                table: "Todos");

            migrationBuilder.AddColumn<long>(
                name: "Idegenkulcs",
                table: "Todos",
                nullable: false,
                defaultValue: 0L);

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
