using System.Text.Json.Serialization;
using Microsoft.EntityFrameworkCore;
using API2.Context;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddDbContext<DbContexto>(options => 
    options.UseSqlServer(builder.Configuration.GetConnectionString("ConexaoPadrao")));


builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddControllers().AddJsonOptions(options =>
    {
        options.JsonSerializerOptions.Converters.Add(new JsonStringEnumConverter());
    });

var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI(c =>
    {
        c.SwaggerEndpoint("/swagger/v1/swagger.json", "My API V1");
        c.RoutePrefix = string.Empty;
    });
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();
