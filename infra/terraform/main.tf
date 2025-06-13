  provider "aws" {
    region  = "us-east-1"
    profile = "terraform-user"
  }

  resource "aws_instance" "task_api_instance" {
    ami           = "ami-084568db4383264d4"
    instance_type = "t2.micro"

    key_name               = "devops-key"
    vpc_security_group_ids = ["sg-0c052e2271eb3788f"]
    subnet_id = "subnet-0b01866ec5d07be64"

    tags = {
      Name = "task-manager-api-instance"
    }
  }