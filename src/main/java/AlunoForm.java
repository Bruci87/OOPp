public class AlunoForm {
        //Create of atributtes.
        //ArrayList<String>notas=new ArrayList<>();
        private String name;
        private int enrollment;
        private float grades1;
        private float grades2;
        private float grades3;
        private float Average;
        private String status;

        //Create of contructor
        public AlunoForm() {
            this.name = "X";
            this.enrollment = 000000000000;
            this.grades1 = 0;
            this.grades2 = 0;
            this.grades3 = 0;
            this.Average = 0;
            this.status = "Indefinido";
        }

        //Create of methods.
        public void setName(String name) {
            this.name = name;
        }

        public void setEnrollment(int enrollment) {
            this.enrollment = enrollment;
        }
        public void setGrades(float grades1, float grades2, float grades3) {
            this.grades1 = grades1;
            this.grades2 = grades2;
            this.grades3 = grades3;
        }
        public void calculateAverage(){
            this.Average = (grades1 + grades2 + grades3) / 3;
            updateStatus();
        }
        public void updateStatus(){
            if(this.Average>5.9){
                this.status="Aprovado por nota";
            }else{
                if(this.Average>3.9){
                    this.status="Recuperacao";
                }else{
                    this.status="Reprovado";
                    if(this.Average < 0){
                        this.status="Nao existe nota negativa";
                    }
                }
            }
        }
        public boolean  searchStudent(int enrollment) {
            return this.enrollment == enrollment;
        }
        public int getEnrollment(){
            return this.enrollment;
        }
        public String getName(){
            return this.name;
        }
        public float getGrades1(){
            return this.grades1;
        }
        public float getGrades2(){
            return this.grades2;
        }
        public float getGrades3(){
            return this.grades3;
        }
        public float getAverage(){
            return this.Average;
        }

    public String getStatus(){
            return this.status;
        }
        public String changeGrades(int gradeCode, float gradeValue){
            switch(gradeCode){
                case 1:
                    this.grades1=gradeValue;
                    return "Grade 1 updated successfully.";
                case 2:
                    this.grades2=gradeValue;
                    return "Grade 1 updated successfully.";
                case 3:
                    this.grades3=gradeValue;
                    return "Grade 1 updated successfully.";
                default:
                    return "Invalid grade code.";
            }

        }
        public String getInfo(){
            return "Nome: " + name + "\nMatrícula: " + enrollment + "\nNotas: " + grades1 + ", " + grades2 + ", " + grades3 +
                    "\nMédia: " + Average + "\nSituação: " + status;
        }
}
