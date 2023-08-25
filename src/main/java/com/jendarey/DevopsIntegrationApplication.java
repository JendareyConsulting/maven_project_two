package com.jendarey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

    @GetMapping
    public String message() {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>Jendarey Consulting Inc/Homepage</title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<h1>Welcome Jendarey Consulting, Inc.</h1>\n" +
                "<span>\n" +
                "\t\t<img src=\"images/jendareyConsultingLogo.jpeg\" alt=\"\" width=\"150\">\n" +
                "\t</span>\n" +
                "<h1 align=\"center\">Working to improve you!</h1>\n" +
                "\n" +
                "<h2 align=\"center\">Looking for a career change and a pay increase? We extend an invitation to you for an online DevOps Engineer Career Training. Learn more about the upcoming training sessions. Are you interested in upgrading to a more satisfying and flexible career? Would you like to earn $180,000.00 or more per year with little to no experience? A career as a DevOps Engineer might be the right choice for you!</h2>\n" +
                "\n" +
                "<span>\n" +
                "\t\t<img src=\"images/jendareyConsultingLogo.jpeg\" alt=\"\" width=\"150\">\n" +
                "\t</span>\n" +
                "\n" +
                " <h1 style=\"text-align: center;\">Learn Essential DevOps Tools in 20 Weeks:</h1>\n" +
                "\t<h4><p style=\"text-align: center;\">\n" +
                "\t\tLinux, Git, Github, Maven, SonarQube, Nexus, Jenkins, Tomcat, Nginx, Docker, Kubernetes,\n" +
                "\t\tPrometheus, Grafana, Ansible, Terraform, Amazon Web Services(EC2, S3, IAM, RDS, ECS, EKS, ECR etc), Microsoft Azure, and Google Cloud Platform (GCP)\n" +
                "\t</p></h4>\n" +
                "\n" +
                "<div style=\"text-align: center;\">\n" +
                "\t<span>\n" +
                "\t\t<img src=\"images/jendareyConsultingLogo.jpeg\" alt=\"\" width=\"150\">\n" +
                "\t</span>\n" +
                "\t<h3><span style=\"font-weight: bold;\">\n" +
                "                Jendarey Consulting, \n" +
                "\t\tDallas, Texas, United States\n" +
                "\t\t+1 682 298 8089,\n" +
                "\t\tak@jendareyconsulting.com</h3>\n" +
                "\t\t<a href=\"mailto:ak@jendareyconsulting.com\">Mail to Jendarey Consulting</a>\n" +
                "\t</span>\n" +
                "</div>\n" +
                "<hr>\n" +
                "\t<p> Service : <a href=\"services/employee/getEmployeeDetails\">Get Employee Details </p>\n" +
                "<hr>\n" +
                "<hr>\n" +
                "<p align=center> Jendarey Consulting - Consultant, AML Training and Software Development</p>\n" +
                "<p align=center><small>Copyrights 2023 by <a href=\"http://jendareyconsulting/\">Jendarey Consulting</a> </small></p>\n" +
                "\n" +
                "<h4>Click below to register for DevOps Bootcamp Virtual Registration</h4>\n" +
                "\n" +
                "<h3 align=\"center\">After you fill out this order request, we will contact you to go over details and availability before the registration is completed.</h3>\n" +
                "\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>DevOps Engineer Training Registration</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 400px;\n" +
                "            margin: auto;\n" +
                "            padding: 20px;\n" +
                "            border: 1px solid #ccc;\n" +
                "            border-radius: 5px;\n" +
                "            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "        label {\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .name-fields {\n" +
                "            display: flex;\n" +
                "            justify-content: space-between;\n" +
                "            gap: 10px;\n" +
                "        }\n" +
                "        input[type=\"text\"], input[type=\"email\"], select {\n" +
                "            width: 100%;\n" +
                "            padding: 10px;\n" +
                "            margin: 5px 0;\n" +
                "            border: 1px solid #ccc;\n" +
                "            border-radius: 3px;\n" +
                "        }\n" +
                "        button {\n" +
                "            background-color: #007bff;\n" +
                "            color: white;\n" +
                "            border: none;\n" +
                "            padding: 10px 20px;\n" +
                "            border-radius: 3px;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h3 align=\"center\">DevOps Engineer Training Registration</h3>\n" +
                "        <form action=\"#\" method=\"POST\">\n" +
                "            <div class=\"name-fields\">\n" +
                "                <div>\n" +
                "                    <label for=\"firstname\">First Name:</label>\n" +
                "                    <input type=\"text\" id=\"firstname\" name=\"firstname\" required>\n" +
                "                </div>\n" +
                "                <div>\n" +
                "                    <label for=\"lastname\">Last Name:</label>\n" +
                "                    <input type=\"text\" id=\"lastname\" name=\"lastname\" required>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <label for=\"email\">Email:</label>\n" +
                "            <input type=\"email\" id=\"email\" name=\"email\" required>\n" +
                "\n" +
                "            <label for=\"phone\">Phone Number:</label>\n" +
                "            <input type=\"text\" id=\"phone\" name=\"phone\" required>\n" +
                "\n" +
                "            <label for=\"experience\">Years of Experience:</label>\n" +
                "            <input type=\"text\" id=\"experience\" name=\"experience\" required>\n" +
                "\n" +
                "            <label for=\"city\">City:</label>\n" +
                "            <input type=\"text\" id=\"city\" name=\"city\" required>\n" +
                "\n" +
                "            <label for=\"country\">Country of Residence:</label>\n" +
                "            <input type=\"text\" id=\"country\" name=\"country\" required>\n" +
                "\n" +
                "            <p><strong>Training Type:</strong> DevOps Engineer Training</p>\n" +
                "\n" +
                "            <button type=\"submit\">Register</button>\n" +
                "        </form>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>\n" +
                "\n" +
                "\n" +
                "<h4><a href=\"recipt.html\">Read More</a></h4>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

}


