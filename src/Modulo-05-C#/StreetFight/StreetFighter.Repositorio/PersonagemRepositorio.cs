using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Repositorio
{
    public class PersonagemRepositorio : IPersonagemRepositorio
    {
        private readonly string CaminhoArquivo;
        public PersonagemRepositorio()
                : this(@"C:\Users\henrique.ostermann\henrique.ostermann\src\Modulo-05-C#\StreetFighter\ListaPersonagem.csv") { }
        internal PersonagemRepositorio(string caminhoArquivo)
        {
            this.CaminhoArquivo = caminhoArquivo;
            if (!File.Exists(CaminhoArquivo))
            {
                File.Create(CaminhoArquivo).Close();
            }
        }
        public List<Personagem> ListarPersonagem()
        {
            return this.ListarPersonagem(null);
        }
        public List<Personagem> ListarPersonagem(string filtroNome)
        {
            var lista = new List<Personagem>();
            var personagem = File.ReadLines(CaminhoArquivo);
            foreach (var procuraPersonagem in personagem)
            {
                var parametro = procuraPersonagem.Split(';');
                Personagem character = new Personagem(Convert.ToInt32(parametro[0]), parametro[1], DateTime.ParseExact(parametro[2], "dd/mm/yyyy", new CultureInfo("pt-BR")),
                    Convert.ToInt32(parametro[3]), parametro[4], Convert.ToDecimal(parametro[5]), parametro[6], parametro[7], Convert.ToBoolean(parametro[8]));
                if (filtroNome == null || character.Nome.Contains(filtroNome))
                {
                    lista.Add(character);
                }
            }
                return lista;
           
        }
        public void IncluirPersonagem(Personagem personagem)
        {
            var conteudo = String.Format("{0};{1};{2};{3};{4};{5};{6};{7};{8};{9}",
                this.ProximoId(),
                personagem.Nome,
                personagem.Nascimento.ToString("dd/mm/yyyy"),
                personagem.Altura,
                personagem.Origem,
                personagem.Peso,
                personagem.Imagem,
                personagem.GolpeEspecialFamoso,
                Environment.NewLine);
                File.AppendAllText(CaminhoArquivo, conteudo);
        }
        public void EditarPersonagem(Personagem personagem)
        {
            this.ExcluirPersonagem(personagem);
            var lista = this.ListarPersonagem();
            lista.Add(personagem);
            this.ReescreveArquivo(lista);
        }
        public void ExcluirPersonagem(Personagem personagem)
        {
            var lista = this.ListarPersonagem();
            foreach (var item in lista)
            {
                bool deveExcluir = personagem.Id == item.Id;
                if (deveExcluir)
                {
                    lista.Remove(item);
                    break;
                }
            }
            this.ReescreveArquivo(lista);
        }
        private void ReescreveArquivo(List<Personagem> lista)
        {
            if (File.Exists(CaminhoArquivo))
            {
                File.Delete(CaminhoArquivo);
            }
            using (File.Create(CaminhoArquivo)) ;
            foreach (var item in lista)
            {
                this.IncluirPersonagem(item);
            }
        }
        private int ProximoId()
        {
            var lista = this.ListarPersonagem();
            if(lista.Count == 0)
            {
                return 1;
            }
            else
            {
                return lista.OrderBy(character => character.Id).Last().Id + 1;
            }
        }
        
    }
}

//using (var conexao = new SqlConnection(connectionString))
//{
//    connection.Open();
//    string sql = $"SELECT * FROM FichaTecnica WHERE Nome LIKE @param_title";
//    var command = new SqlCommand(sql, connection);
//    command.Parameters.Add(new SqlParameter("param_title", Nome));
//    SqlDataReader reader = command.ExecuteReader();
    
//    while(reader.Read())
//    {
//        Movie found = ConvertReaderToMovie(reader);
//        result.Add(found);
//    }
//}
//private Movie ConvertReaderToMovie(SqlDataReader reader)
//{
//    int idRow = Convert.ToInt32(reader["Id"]);
//    string titleRow = reader["Title"].ToString();

//}