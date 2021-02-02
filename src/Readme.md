#Agent Prerequisites:

Verify that you have Java installed by running the java --version command in your terminal. If not, download and install the latest version on your computer.

Verify that you have Git installed by running the git --version command in your terminal. If not, download and install the latest version on your computer.

Verify that you have Maven (at least version 3.0) installed by running the mvn -v command in your terminal. If not, download and install the latest version on your computer.

#Move code to Azure Repo
git init
git status
git add .
git commit -m "Initial Status"
git remote add origin https://dsettraining@dev.azure.com/dsettraining/skillmatrix/_git/skillmatrix
git push -u origin --all

#Build Steps:
- generate jar file for skillsmatrix api (mvn package -P production)

#Deploy Step
- Azure release pipeline

