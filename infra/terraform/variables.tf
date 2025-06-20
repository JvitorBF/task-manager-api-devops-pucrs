variable "region" {
  type    = string
  default = "us-east-1"
}

variable "ami" {
  description = "ID da AMI"
  type = string
}

variable "instance_type" {
  type    = string
  description = "Tipo da instância EC2"
  default = "t2.micro"
}

variable "key_name" {
  description = "Nome do par de chaves SSH"
  type = string
}

variable "security_group_ids" {
  description = "ID do Security Group"
  type = list(string)
}

variable "subnet_id" {
  description = "ID da subnet"
  type = string
}